package tutttts;

public class infixtopostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix="a+b*(c-d)/e";
		stack s=new stack(infix.length());
		String postfix="";
		s.push('(');
		infix=infix+')';
		char token;
		int i;
		for(i=0;i<infix.length();i++)
		{
			token=infix.charAt(i);
			if(token=='(')
				s.push('('); // or s.push(token)
			else if(token==')')
			{
				while(s.peakvalue()!='(')
					postfix=postfix+s.pop();
				s.pop();
			}
			else if(token=='+'||token=='-'||token=='*'||token=='/')
			{
				while(getPriority(s.peakvalue())>=getPriority(token))
					postfix=postfix+s.pop();
				s.push(token);
			}
			else
				postfix=postfix+token;
		}
		System.out.println("postfix exp is="+postfix);

	}
	
	private static int getPriority(char opr)
	{
		if(opr=='*' || opr=='/')
			return 5;
		if(opr=='+' || opr=='-')
			return 3;
		return 0;
	}

}
