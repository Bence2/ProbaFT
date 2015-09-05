package hu.springweb.chatapp.responseobjects;

import java.util.Date;

public class Message
{
	private String senderName;
	private int sendersAge;
	private String message;
	private Date dateOfMessage = new Date();

	public String getSenderName()
	{
		return senderName;
	}

	public void setSenderName(String senderName)
	{
		this.senderName = senderName;
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
