	  public boolean sendEmail(String subject,String content,ArrayList<String> files,String type) {
		  	LOGGER.info("Sending email");

		   JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

	       mailSender.setHost("smtp.gmail.com");
	       mailSender.setPort(587);          
	       mailSender.setUsername(env.getProperty("senderMail"));
	       mailSender.setPassword(env.getProperty("senderPassword"));
	       Properties props = mailSender.getJavaMailProperties();

	       props.put("mail.transport.protocol", env.getProperty("spring.mail.transport.protocol"));
	       props.put("mail.smtp.auth", env.getProperty("spring.mail.properties.mail.smtp.auth"));

	       props.put("mail.smtp.starttls.enable", env.getProperty("spring.mail.properties.mail.smtp.starttls.enable"));
	       
	       MimeMessage mimeMessage = mailSender.createMimeMessage();
	       MimeMessageHelper helper;
			try {
				helper = new MimeMessageHelper(mimeMessage,true, CharEncoding.UTF_8);
				helper.setText(content, true);
				
				if(type.equals("search")) {
					helper.setTo(InternetAddress.parse(env.getProperty("toSearchEmail")));
				}
				if(type.equals("create")) {
					helper.setTo(InternetAddress.parse(env.getProperty("toEmail")));
				}
		    	   helper.setSubject(subject);
		    	   helper.setFrom(env.getProperty("senderMail"));
		    	   for (String string : files) {
		    		   Path path = Paths.get(emailFolder+string);
		    		   byte[] c;
						try {
							c = Files.readAllBytes(path);
							helper.addAttachment(string, new ByteArrayResource(c));
						} catch (IOException e) {
							e.printStackTrace();
					    }	    		   
		    	   }
		    	   mailSender.send(mimeMessage);
		    	   LOGGER.info("Email Sent");
		    	   return true;
		    	   
			} catch (MessagingException e1) {
				LOGGER.info("Email Failed due to to " + e1.getMessage());
				e1.printStackTrace();
				return false;
			}
	   
	    
	  }
