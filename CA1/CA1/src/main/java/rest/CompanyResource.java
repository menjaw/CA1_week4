package rest;

import com.google.gson.Gson;
import entity.Company;
import facade.FacadeCompany;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("company")
public class CompanyResource {

    private FacadeCompany fc;
    private Gson gson;
    
    @Context
    private UriInfo context;

    public CompanyResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "{}";
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String addCompany() {
        //List<Company> companies = ;
        return "{}";
    }

    @GET
    @Path("/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("number") String number) {
        Company c = fc.getCompanyByPhone(number);
        if(c != null){
            return new Gson().toJson(c);
        }
//        else{
//            company = fc.getCompanyByPhone(number);
//            return new Gson().toJson(company);
//        }
        return "{}";    
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
