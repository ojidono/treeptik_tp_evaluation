package fr.treeptik.evaluation.utils;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

	@ApplicationPath("/api")
	public class JaxRsActivator extends Application {
		public static final String API_URL_PATH = "/api";
		

		public static String generateRestEndpointUrl(HttpServletRequest request, String endpoint) {
			return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + API_URL_PATH + endpoint;
		}
		public static String generateRestEndpointUrl(String endpoint) {
			return generateRestEndpointUrl(generateRequest(), endpoint);
		}
		public static HttpServletRequest generateRequest() {
			return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		}
	}
