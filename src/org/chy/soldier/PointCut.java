package org.chy.soldier;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

public class PointCut extends NameMatchMethodPointcut {

	private static final long serialVersionUID = 7366792568476683938L;

	@Override
	public boolean matches(Method arg0, Class arg1) {
//        String[] methods = { "handKillEnemy", "scatterKillEnemy" };
		String[] methods = { "sdfsaf"};
        
        //也可以用“ * ” 来做匹配符号
        // this.setMappedName("get*");
        
        this.setMappedNames(methods);

        return super.matches(arg0, arg1);
	}

}
