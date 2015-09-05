package hu.springweb.chatapp.businessbeans;

import java.util.Date;

public class Message
{
	private String sendersName;
	private int sendersAge;
	private String message;
	private Date dateOfMessage = new Date();

	public String getSendersName()
	{
		return sendersName;
	}

	public void setSendersName(String senderName)
	{
		this.sendersName = senderName;
	}

	public int getSendersAge()
	{
		return sendersAge;
	}

	public void setSendersAge(int sendersAge)
	{
		this.sendersAge = sendersAge;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Date getDateOfMessage()
	{
		return dateOfMessage;
	}

	public void setDateOfMessage(Date dateOfMessage)
	{
		this.dateOfMessage = dateOfMessage;
	}


}
