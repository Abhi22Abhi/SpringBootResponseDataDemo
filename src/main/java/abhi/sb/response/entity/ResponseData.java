package abhi.sb.response.entity;

import java.util.Date;
import java.util.List;

public class ResponseData {
	
	private Date timestamp;
	private Integer statusCode;
	private String status;
	private String error;
	private String message;
	private String path;
	private List<?> response;
	
	
	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public Integer getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public List<?> getResponse() {
		return response;
	}


	public void setResponse(List<?> response) {
		this.response = response;
	}


	public ResponseData() {
		super();
	}


	public ResponseData(Date timestamp, Integer statusCode, String status, String message, List<?> response) {
		this.timestamp = timestamp;
		this.statusCode = statusCode;
		this.status = status;
		this.message = message;
		this.response = response;
	}


//	public ResponseData(Date timestamp, Integer statusCode, String status, String error, String message, String path,
//			List<?> response) {
//		this.timestamp = timestamp;
//		this.statusCode = statusCode;
//		this.status = status;
//		this.error = error;
//		this.message = message;
//		this.path = path;
//		this.response = response;
//	}	
}
