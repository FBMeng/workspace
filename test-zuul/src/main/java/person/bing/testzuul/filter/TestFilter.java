package person.bing.testzuul.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
@Component
public class TestFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		for(int i=0;i<10;i++){
			System.out.println("");
		}
		System.out.println("success");
		for(int i=0;i<10;i++){
			System.out.println("");
		}
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
		return "pre";
	}

}
