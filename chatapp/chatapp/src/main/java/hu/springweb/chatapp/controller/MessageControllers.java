package hu.springweb.chatapp.controller;

import hu.springweb.chatapp.businessbeans.Message;
import hu.springweb.chatapp.service.GetMessagesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageControllers
{
	@Autowired
	GetMessagesService getMessagesService;

	//mukodik de nem kell
	@RequestMapping(value = "/index")
	public String indexHandlerq()
	{
		return "index";
	}

	@RequestMapping(value = "/getmessages", method = RequestMethod.GET)
	public @ResponseBody List<Message> messageHandler()
	{
		List<Message> messages = getMessagesService.getMessages();

		return messages;

	}

	@RequestMapping(value = "/sendmessages", method = RequestMethod.POST)
	public @ResponseBody List<Message> postMessageHandler(@RequestBody Message message)
	{
		//		return "sikeresen megtortent a message post: " + message.getMessage();
		List<Message> messages = getMessagesService.getMessages();
		messages.add(message);
		return messages;
	}

}
