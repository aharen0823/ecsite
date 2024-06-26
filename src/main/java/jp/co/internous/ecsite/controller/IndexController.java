package jp.co.internous.ecsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import jp.co.internous.ecsite.model.domain.MstGoods;
import jp.co.internous.ecsite.model.domain.MstUser;
import jp.co.internous.ecsite.model.dto.HistoryDto;
import jp.co.internous.ecsite.model.form.CartForm;
import jp.co.internous.ecsite.model.form.HistoryForm;
import jp.co.internous.ecsite.model.form.LoginForm;
import jp.co.internous.ecsite.model.mapper.MstGoodsMapper;
import jp.co.internous.ecsite.model.mapper.MstUserMapper;
import jp.co.internous.ecsite.model.mapper.TblPurchaseMapper;

@Controller
@RequestMapping("/ecsite")
public class IndexController {

	@Autowired
	//Mstgoodsを介してmst_goodsテーブルにアクセスするためのmapper(DAO)
	private MstGoodsMapper goodsMapper;
	
	@Autowired
	//MstUserを介してmst_userテーブルにアクセスするためのmapper(DAO)
	private MstUserMapper userMapper;
	
	@Autowired
	private TblPurchaseMapper purchaseMapper;
	//webサービスAPIとして作成するためJSON形式を扱えるようGsonをインスタンス化しておく
	private Gson gson = new Gson();
	
	//トップページ(index.html)に遷移するメソッド
	@GetMapping("/")
	public String index(Model model) {
		List<MstGoods> goods = goodsMapper.findAll();
		model.addAttribute("goods",goods);
		//この記述によりindex.htmlに遷移する
		return "index";
	}
	@ResponseBody //文字列そのものが返却される
	@PostMapping("/api/login")
	//mst_userテーブルから、ユーザー名とパスワードによって検索し、結果を取得
	public String loginApi(@RequestBody LoginForm f) {
		MstUser user = userMapper.findByUserNameAndPassword(f);
		
		if(user == null) {
			user = new MstUser();
			user.setFullName("ゲスト");
		}
		return gson.toJson(user);
	}
	
	@ResponseBody
	@PostMapping("/api/purchase")
	public int purchaseApi(@RequestBody CartForm f) {
		
		f.getCartList().forEach((c) ->{
			int total = c.getPrice() * c.getCount();
			purchaseMapper.insert(f.getUserId(), c.getId(), c.getGoodsName(), c.getCount(), total);
		});
		
		return f.getCartList().size();
	}
	
	@ResponseBody
	@PostMapping("/api/history")
	public String historyApi(@RequestBody HistoryForm f) {
		int userId = f.getUserId();
		List<HistoryDto> history = purchaseMapper.findHistory(userId);
		
		return gson.toJson(history);
	}
	
	
	
}
