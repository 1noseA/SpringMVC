package jp.co.nose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class EchoController {

	// 入力画面表示
	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";
	}

	// 出力画面表示
	@RequestMapping(method = RequestMethod.POST)
	public String echo(EchoForm form) {
		return "echo/output";
	}

	// 入力チェック
//	@RequestMapping(method = RequestMethod.POST)
//	public String echo(@Valid EchoForm form, BindingResult result) {
//		if(result.hasErrors()) {
//			return "echo/input";
//		}
//		return "echo/output";
//	}
}
