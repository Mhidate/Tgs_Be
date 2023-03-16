package org.acme;


import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.time.format.DateTimeFormatter;



@ApplicationScoped
@Path("/laporan")
public class KebunResources {

    

    @Inject
    EntityManager entityManager;

    @POST
    @Path("buat")
    @Transactional
    public void createData() {
        
        UUID uuid = UUID.randomUUID();
        LocalDate created_at = LocalDate.now();
        String komoditas = "Tomat";

        entityManager.createNativeQuery("INSERT INTO kebun (id, created_at, komoditas) VALUES (:id, :created_at, :komoditas)")
            .setParameter("id", uuid)
            .setParameter("created_at", created_at)
            .setParameter("komoditas", komoditas)
            .executeUpdate();
    }


    @Inject
    EntityManager eml;

    @GET
    @Path("lihat")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public List<Kebun> getLaporan (){
           List<Kebun> laporan = eml.createQuery("SELECT k FROM Kebun k", Kebun.class).getResultList();
           return laporan;     
    }



    /*untuk buat report manual ke file pdf */
    @Inject
    JasperReportGeneratorService jasperReportGeneratorService;

    @GET
    @Path("convert")
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


 
}
