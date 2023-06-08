package com.example.demo.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	
	private String enemyAction;
	Select select = new Select();
	EnemySetting enemy = new EnemySetting();
	MyStatus ms = new MyStatus();
	Action act = new Action();
		
	@GetMapping("/chiikawabattle/home")
	public String defaultView() {
		return "Home.html";
	}
	
	@GetMapping("/chiikawabattle/battle")
	public String battleView(Model model) {
		model.addAttribute("select", select.getSelect());
		model.addAttribute("enemy", enemy.getName());
		model.addAttribute("item", enemy.getImageName());
		model.addAttribute("hpbar", enemy.es.getHpImage());
		model.addAttribute("myitem", select.getSelect());
		model.addAttribute("myhpbar", ms.getHpImage());
		return "Battle.html";
	}
	
	@PostMapping("/chiikawabattle/battle")
	public String action(@RequestParam String action, Model model) {
		//my character action
		act.setAction(action);
		switch(action) {
		case "こうげき":
			this.enemy.es.attacked();
			break;
		case "まもる":
			this.ms.gard();
			break;
		default:
		}
		model.addAttribute("action", action);
		//enemy action
		EnemyAction ea = new EnemyAction();
		switch(ea.getAction()) {
		case "いっこつよいこうげき":
			this.ms.attacked(2);
			break;
		case "こうげき":
			this.ms.attacked(1);
			break;
		default:
		}
		model.addAttribute("enemyAction", ea.getAction());
		enemyAction = ea.getAction();
		this.updateStatus(model);
		if(enemy.es.getHp() <= 0) {
			return "Win.html";
		}else if(ms.getHp() <= 0) {
			return "Lose.html";
		}else {
			return "Battle.html";
		}
		
	}
	
	@GetMapping("/chiikawabattle/ready")
	public String readyView() {
		return "Ready.html";
	}
	
	@GetMapping("/chiikawabattle/home2")
	public String home2View() {
		return "Home2.html";
	}
	
	@PostMapping("/chiikawabattle/home2")
	public String postValue(@RequestParam String selecter,Model model) {
		select.setSelect(selecter);
		model.addAttribute("select", selecter);
		return "Home2.html";
	}
	
	@GetMapping("/chiikawabattle/describe1")
	public String describeMyCharacter(Model model) {
		model.addAttribute("select", select.getSelect());
		model.addAttribute("action", act.getAction());
		return "Describe1.html";
	}
	
	@GetMapping("/chiikawabattle/describe2")
	public String describeEnemy(Model model) {
		model.addAttribute("enemy", enemy.getName());
		model.addAttribute("enemyAction", this.enemyAction);
		return "Describe2.html";
	}
	
	private void updateStatus(Model model) {
		model.addAttribute("select", select.getSelect());
		model.addAttribute("enemy", enemy.getName());
		model.addAttribute("item", enemy.getImageName());
		model.addAttribute("hpbar", enemy.es.getHpImage());
		model.addAttribute("myitem", select.getSelect());
		model.addAttribute("myhpbar", ms.getHpImage());
	}
}
