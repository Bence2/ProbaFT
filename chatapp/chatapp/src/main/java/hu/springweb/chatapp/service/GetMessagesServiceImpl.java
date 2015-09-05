package hu.springweb.chatapp.service;

import hu.springweb.chatapp.businessbeans.Message;

import java.util.ArrayList;
import java.util.List;

public class GetMessagesServiceImpl implements GetMessagesService
{

	private List<Message> messages = new ArrayList<>();
	Message message1 = new Message();
	{
		message1.setMessage("első üzenet");
		message1.setSendersName("Bence");
		message1.setSendersAge(20);

		messages.add(message1);
	}

	@Override
	public List<Message> getMessages()
	{
		return messages;
	}

}
