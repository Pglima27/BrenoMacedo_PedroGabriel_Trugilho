package br.com.viagem.controller;
import java.io.IOException;
import java.util.*;

import javax.swing.text.View;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.qpxExpress.QPXExpressRequestInitializer;
import com.google.api.services.qpxExpress.QPXExpress;
import com.google.api.services.qpxExpress.model.FlightInfo;
import com.google.api.services.qpxExpress.model.LegInfo;
import com.google.api.services.qpxExpress.model.PassengerCounts;
import com.google.api.services.qpxExpress.model.PricingInfo;
import com.google.api.services.qpxExpress.model.SegmentInfo;
import com.google.api.services.qpxExpress.model.SliceInfo;
import com.google.api.services.qpxExpress.model.TripOption;
import com.google.api.services.qpxExpress.model.TripOptionsRequest;
import com.google.api.services.qpxExpress.model.TripsSearchRequest;
import com.google.api.services.qpxExpress.model.SliceInput;
import com.google.api.services.qpxExpress.model.TripsSearchResponse;

public class GetPassagem {

	List<PricingInfo> priceInfo;
	//ArrayList<String> price = new ArrayList<String>();
	private String cidade1;
	private String cidade2;
	private String data;
	
	private static final String APPLICATION_NAME = "MyFlightApplication";

    private static final String API_KEY = "AIzaSyDnBCdsmTnrL5XFrO2TjJyvFioswjakNYU";

    /** Global instance of the HTTP transport. */
    private static HttpTransport httpTransport;

    /** Global instance of the JSON factory. */
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    public GetPassagem(String cidade1,String cidade2, String data){
    	this.cidade1 = cidade1;
    	this.cidade2 = cidade2;
    	this.data = data;
    }
    
    public List<PricingInfo> getPrice(){
    	return priceInfo;
    }


  public  void passagem() {
      // TODO Auto-generated method stub
	  
       try {
            httpTransport = GoogleNetHttpTransport.newTrustedTransport();


            
              List<SliceInput> slices = new ArrayList<SliceInput>();
              
              SliceInput slice = new SliceInput();
              slice.setOrigin(cidade1); 
              slice.setDestination(cidade2); 
              slice.setDate(data);
              slices.add(slice);

              TripOptionsRequest request= new TripOptionsRequest();
              request.setSolutions(10);
              request.setSlice(slices);

              TripsSearchRequest parameters = new TripsSearchRequest();
              parameters.setRequest(request);
              QPXExpress qpXExpress= new QPXExpress.Builder(httpTransport, JSON_FACTORY, null).setApplicationName(APPLICATION_NAME)
                      .setGoogleClientRequestInitializer(new QPXExpressRequestInitializer(API_KEY)).build();

              TripsSearchResponse list= qpXExpress.trips().search(parameters).execute();
              List<TripOption> tripResults=list.getTrips().getTripOption();
              //String id;

              for(int i=0; i<tripResults.size(); i++){
                  //Trip Option ID
                  //id= tripResults.get(i).getId();
                  priceInfo = tripResults.get(i).getPricing();
              }
       
                  
             
          } catch (IOException e) {
            System.err.println(e.getMessage());
            
          } catch (Throwable t) {
            t.printStackTrace();
            
          }
          
  }


}
