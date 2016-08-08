package cn.zhx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zhx.pojo.EasyUITreeNode;
import cn.zhx.service.ItemCatSerivce;

@Controller
public class ItemCatController {
	
	@Autowired
	private ItemCatSerivce itemCatSerivce;
	
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id" ,defaultValue="0")Long parentId){
		List<EasyUITreeNode> itemCatList = itemCatSerivce.getItemCatList(parentId);
		return itemCatList;
	}

}
