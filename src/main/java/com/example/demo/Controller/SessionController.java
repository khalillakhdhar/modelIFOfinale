package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.repositories.FormationRepository;

@RestController
@RequestMapping("session")
public class SessionController {
@Autowired
FormationRepository formationRepository;

}
