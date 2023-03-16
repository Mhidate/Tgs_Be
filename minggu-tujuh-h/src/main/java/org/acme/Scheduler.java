package org.acme;
import java.time.LocalDate;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import io.quarkus.scheduler.Scheduled;
import io.quarkus.scheduler.ScheduledExecution;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.smallrye.mutiny.Uni;
import java.io.File;

import java.time.format.DateTimeFormatter;

//import javax.ws.rs.*;


@ApplicationScoped
public class Scheduler {

  /*  pertama kita hit endpoint laporan/buat untuk memulai membuat laporan nya bang ,dimana kolom yang di isi baru id created_at 
  dan komoditas ,karena pada hari pertama belum ada total komoditasnya lalu nanti pas scdule hari ke tujuh baru di isi semua kolom
  kecuali created_at .Keinginan saya jika kita hit endpoint laporan/buat maka otomatis akan melakukan kalkulasi dengan schedulenya 
  supaya pas kita hit endpoint maka akan melakukan memulai schedule hari melakukan penambahan data tapi karena saya belum terlalu 
  tau bang tentang apa saja perintah yg ada jadi saya buat 
  seadanya saja bang
  */ 
 

    @Inject
    EntityManager em;
     
    //@Scheduled(every = "10s")
    //@Scheduled(cron = "1 * * * * ?")  /*untuk setiap detik pertama dalam menit setiap hari */
    @Scheduled(cron = "0 0 0 */7 * ?")  /*untuk schedule 7 hari */
    @Transactional
     void createData(ScheduledExecution execution) {
        UUID uuid = UUID.randomUUID();
        String komoditas = "Tomat";
        Integer total = 500;
        LocalDate updated_at = LocalDate.now();

        em.createNativeQuery("INSERT INTO kebun (id, komoditas, total, updated_at) VALUES (:id, :komoditas, :total, :updated_at)")
            .setParameter("id", uuid)
            .setParameter("komoditas", komoditas)
            .setParameter("total", total)
            .setParameter("updated_at", updated_at)
            .executeUpdate();
    }


    @Inject
    JasperReportGeneratorService jasperReportGeneratorService;

    @Scheduled(cron = "0 0 0 */7 * ?")
    public void get() throws Exception {

        // String uuidToken = UUID.randomUUID().toString();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString = currentDate.format(formatter);
        
        String fileName = "Laporan-Tomat-" + dateString + ".pdf";
        String outputFileName = "external_resources/generatedReport/" + fileName;
        String jasperReportPath = "external_resources/jasperReport/tomat.jrxml";
        jasperReportGeneratorService.generatePdfReport(jasperReportPath, outputFileName);

    }



      @Inject
      ReactiveMailer reactiveMailer;

      // @GET
      // @Path("/reactive")
      @Scheduled(cron = "0 0 0 1 * ?") /*setiap hari pertama setiapbulan pada pukul 00:00 */
      public Uni<Void> sendEmailUsingReactiveMailer() {

          return reactiveMailer.send(                        
                  Mail.withText("ayot427@gmail.com",
                          "Laporan Tomat",
                          "Hay pak deng,ini laporan tomat anda bulan ini"
                  ).addAttachment("report16-03-2023.pdf",
                  new File("C:/Users/User/Documents/minggu-tujuh-h/external_resources/generatedReport/report16-03-2023.pdf"),
                  "application/pdf"));
  
          
          
      } 
    
    
}