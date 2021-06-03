package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Session;
import com.example.demo.bean.repositories.FormationRepository;
import com.example.demo.bean.repositories.SessionRepository;

@RestController
@RequestMapping("session")
public class SessionController {
@Autowired
SessionRepository sessionRepository;
@GetMapping
public List<Session> getAllSessions()
{
return  (List<Session>) sessionRepository.findAll();	
}
@PostMapping
public Session addSession(@Valid @RequestBody Session session)
{
return sessionRepository.save(session);	
}
}
