package com.poly;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PhepTinhController 
{
	@GetMapping("pheptinh/form")
	public String doGetform()
	{
		return "form";
	}
	
	@RequestMapping("/ketqua")
	public String abc()
	{
		return "form";
	}

	@GetMapping("/pheptinh")
	public String doGetPhepTinh2(@RequestParam("a") int a, @RequestParam("b") int b, Model model)
	{
		int ketqua=a+b;
		model.addAttribute("kq", ketqua);
		return "ketqua";   // kết quả sẽ đượi hiển thi lên trang kết quả. trang phép tính/form không hiển thị
	}
	

	
/*
	@Autowired
	HttpServletRequest rq;
	@GetMapping("/pheptinh")
	public String doGetpheptinha(Model model)
	{
		
		int a,b,ketqua;
		
	    a=Integer.parseInt(rq.getParameter("a"));
	    b=Integer.parseInt(rq.getParameter("b"));
		ketqua=a+b;
		model.addAttribute("kq", ketqua);
		return "ketqua";   // kết quả sẽ đượi hiển thi lên trang kết quả. trang phép tính/form không hiển thị
	}
	*/
	

	@PostMapping("/pheptinh")
	public String doGetPhepTinh3(@RequestParam("a") int a, @RequestParam("b") int b, Model model)
	{
		int ketqua=a+b;
		model.addAttribute("kq", ketqua);
		return "ketqua";   // kết quả sẽ đượi hiển thi lên trang kết quả. trang phép tính/form không hiển thị
	}


/*
	@PostMapping("/pheptinh")
	public String doGetPhepTinh(@RequestParam("a") int a, @RequestParam("b") int b, Model model)
	{
		int ketqua=a+b;
		model.addAttribute("kq", ketqua);
		return "forward:/ketqua"; // kết quả sẽ giữ nguyên pheptinh/form được chuyển hướng đến trang kết quả.
	}
*/
/*
	@PostMapping("/pheptinh")
	public String doPhepTinhRedirect(@RequestParam("a") int a, @RequestParam("b") int b, RedirectAttributes redirectAttributes) {
	    int ketqua = a + b;
	    redirectAttributes.addFlashAttribute("kq", ketqua);
	    return "redirect:/ketqua";   //tạo ra 1 url mới kết quả sẽ giữ nguyên pheptinh/form được chuyển hướng đến trang kết quả.
	}

*/

}
