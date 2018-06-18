package cn.origin.util.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class SplitPageUtil {
	private HttpServletRequest request ; // 接收Request对象引用
	public SplitPageUtil() {
		this.request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() ;
	}
	public SplitPageUtil(String url) {
		this() ;  
		System.out.println(url);
		this.request.setAttribute("url", url);
	} 
	public SplitPageUtil(String columnData,String url) {
		this(url) ;
		this.request.setAttribute("columnData", columnData);
	}
	public long getCurrentPage() { 
		long currentPage = 1 ; 		// 当前所在页
		try {
			currentPage = Long.parseLong(this.request.getParameter("cp")) ;
		} catch (Exception e) {}	// 该异常没有必要输出
		return currentPage ; 
	}
	public int getLineSize() {
		int lineSize = 5 ;  // 每页显示的数据行
		try {
			lineSize = Integer.parseInt(request.getParameter("ls")) ;
		} catch (Exception e) {}	// 该异常没有必要输出
		return lineSize ;
	}
	public String getColumn() {
		String column = request.getParameter("col") ; // 接收传递的col参数
		if (column == null) {
			column = "" ;
		}
		return column ;
	}
	public String getKeyword() {
		String keyWord = request.getParameter("kw") ; // 接收查询关键字
		if (keyWord == null) {
			keyWord = "" ; // 为空字符串
		}
		return keyWord ;
	}
}
