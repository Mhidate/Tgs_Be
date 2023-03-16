package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
// import javax.ws.rs.core.MediaType;
// import javax.ws.rs.core.Response;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.smallrye.mutiny.Uni;
import java.io.File;

@Path("/email")
public class EmailResources {
    
    /*class untuk coba-coba pengitiman email */

    @Inject
    ReactiveMailer reactiveMailer;

    @GET
    @Path("/reactive")
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

