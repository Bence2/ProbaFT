package hu.springweb.chatapp.service;

import hu.springweb.chatapp.businessbeans.Message;

import java.util.List;

public interface GetMessagesService
{
	public List<Message> getMessages();
}
