package cn.zhx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zhx.pojo.MybatiesPageHelperRusult;
import cn.zhx.pojo.TaotaoResult;
import cn.zhx.pojo.TbContent;
import cn.zhx.service.ContentSerivce;

@Controller
public class ContentController {

	@Autowired
	private ContentSerivce contentSerivce;
	
	
	/**description 根据商品类型查询商品列表
	 * @param categoryId
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value="/content/query/list")
	@ResponseBody
	public MybatiesPageHelperRusult getContentListByCategoryId
	(long categoryId ,int page,int rows) {
		
		return contentSerivce.getContentList(categoryId, page, rows);
	}
	
	/**添加商品
	 * @param content
	 * @return
	 */
	@RequestMapping(value="/content/save")
	@ResponseBody
	public TaotaoResult saveContent(TbContent content) {
		
		return contentSerivce.saveContent(content);
		 
	}
	
	
}
