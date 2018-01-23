package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);

	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		logger.info("doE called but redirect to /doF.........");

		rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		return "redirect:/doF";
	}

	@RequestMapping("/doF")
	// public void doF(@ModelAttribute String msg) {
	// public void doF(@ModelAttribute("msg") String msg) { // ok
	// public void doF(String msg) { // no
	// public void doF(@ModelAttribute("msg") String msg2) { // ok
	public void doF(String msg) { // ok
		logger.info("doF called..................." + msg);
	}
}
