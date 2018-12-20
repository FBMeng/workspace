package person.bing.testzuul.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
@Component
public class PostFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
//		RequestContext ctx = RequestContext.getCurrentContext();
//		HttpServletResponse response = ctx.getResponse();
//		response.setHeader("Access-Control-Allow-Origin", "*");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "post";
	}

}
