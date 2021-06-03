package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Formation;
import com.example.demo.bean.repositories.FormationRepository;

@RestController
public class FormationController {
@Autowired
FormationRepository formationrepository;
@GetMapping("formation")
public List<Formation> getallformations()
{
	return (List<Formation>) formationrepository.findAll();
}
@PostMapping("formation")
public Formation addFormation(@Valid @RequestBody Formation  formation)
{
return formationrepository.save(formation);	
}



}
