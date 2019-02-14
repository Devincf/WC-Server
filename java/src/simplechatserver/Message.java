package simplechatserver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
	private String _message;
	private String _userName;
	SimpleDateFormat formatter;
	
	public String getMessage() {
		return _message;
	}

	public void setMessage(String _message) {
		this._message = _message;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String _userName) {
		this._userName = _userName;
	}

	public Date getMessageSent() {
		return _messageSent;
	}
	
	public String getDate() {
		return formatter.format(_messageSent);
	}

	public void setMessageSent(Date _messageSent) {
		this._messageSent = _messageSent;
	}

	private Date _messageSent;
	
	public Message(String user, String msg, Date time) {
		this._message = msg;
		this._messageSent = time;
		this._userName = user;
	}
	
	public Message(String user, String msg, String time) {
		this._message = msg;
		formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm"); 
		try {
			this._messageSent = formatter.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this._userName = user;
	}
	
}
