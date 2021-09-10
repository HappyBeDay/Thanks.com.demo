package main.com.api.abandonedAnimalInquiryService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorer {
	
	ApiExplorer(String ApiUrl) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/sido"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=JzbaXINjH0i33pEwOnybMAJgFBipoeklYHGonTVn62eZSV7Qp72p1aO0ARQJr9xZ1FBsJKrwzwNuS6wUXPbUAw%3D%3D"); /* Service Key */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json;charset=UTF-8");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		new createXML(sb);
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
	}
}