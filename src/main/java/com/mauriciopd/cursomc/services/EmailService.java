package com.mauriciopd.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mauriciopd.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
