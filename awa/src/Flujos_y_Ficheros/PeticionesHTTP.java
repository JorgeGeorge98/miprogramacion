package Flujos_y_Ficheros;

import java.io.IOException;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class PeticionesHTTP {

	public static void main(String[] args) throws IOException {

		try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
		    HttpGet httpGet = new HttpGet("http://httpbin.org/get");
		    // The underlying HTTP connection is still held by the response object
		    // to allow the response content to be streamed directly from the network socket.
		    // In order to ensure correct deallocation of system resources
		    // the user MUST call CloseableHttpResponse#close() from a finally clause.
		    // Please note that if response content is not fully consumed the underlying
		    // connection cannot be safely re-used and will be shut down and discarded
		    // by the connection manager.
		    try (CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
		        System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
		        HttpEntity entity1 = response1.getEntity();
		        // do something useful with the response body
		        // and ensure it is fully consumed
		        EntityUtils.consume(entity1);



		    }
		    }
		}
	}


