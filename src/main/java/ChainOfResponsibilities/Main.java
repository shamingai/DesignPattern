package ChainOfResponsibilities;

import java.awt.MenuComponent;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    
	    	String msg = "个别词汇:)敏感、稳稳的收益、test；去重复：    、*******、77777777、敏感；特殊字符：|||<Script></Script>";
	    	
	    	MsgProcessor mp = new MsgProcessor();
	    	mp.setMsg(msg);
	    	FilterChain fc = new FilterChain();
	    	
	    	fc.addFilter(new HTMLFilter())
		    	.addFilter(new SesitiveFilter())
		    	.addFilter(new FaceFilter());
	    	mp.setFilterChain(fc);
	    	
	    	String result = mp.process();
	    System.out.println(result);
	    
    }
}