https://leetcode.com/problems/basic-calculator-iv/

class Solution {
    Map<String,Integer> map=new HashMap<>(); //evaluation map
    class Term
    {
        int para=1; //the parameter of this term
        List<String> var=new ArrayList<>(); //each factor (e.a. a*b*b*c->{a,b,b,c})
        @Override
        public String toString()
        {
            if (para==0) return "";
            String ans="";
            for (String s:var) ans+="*"+s;
            return para+ans;
        }
        boolean equals(Term that)
        {
            if (this.var.size()!=that.var.size()) return false;
            for (int i=0;i<this.var.size();i++)
                if (!this.var.get(i).equals(that.var.get(i))) return false;
            return true;
        }
        int compareTo(Term that)
        {
            if (this.var.size()>that.var.size()) return -1;
            if (this.var.size()<that.var.size()) return 1;
            for (int i=0;i<this.var.size();i++)
            {
                int x=this.var.get(i).compareTo(that.var.get(i));
                if (x!=0) return x;
            }
            return 0;
        }
        Term times(Term that)
        {
            Term pro=new Term(this.para*that.para);
            for (String s:this.var) pro.var.add(new String(s));
            for (String s:that.var) pro.var.add(new String(s));
            Collections.sort(pro.var);
            return pro;
        }
        Term(int x) { para=x; }
        Term(String s) { if (map.containsKey(s)) para=map.get(s); else var.add(s); }
        Term(Term that) { this.para=that.para; this.var=new ArrayList<>(that.var); }
    }
    class Expression 
    {
        List<Term> list=new ArrayList<>(); //Term List
        char oper='+'; // Arithmetic symbol
        Expression(int x) { list.add(new Term(x)); }
        Expression(String s) { list.add(new Term(s)); }
        Expression(List<Term> l) { list=l; }
        Expression times(Expression that)
        {
            List<Term> c=new ArrayList<>();
            for (Term t1:this.list)
                for (Term t2:that.list)
                    c.add(t1.times(t2));
            c=combine(c);
            return new Expression(c);
        }
        Expression plus(Expression that,int sgn)
        {
            List<Term> c=new ArrayList<>();
            for (Term t:this.list) c.add(new Term(t));
            for (Term t:that.list) 
            {
                Term t2=new Term(t);
                t2.para=t2.para*sgn;
                c.add(t2);
            }
            c=combine(c);
            return new Expression(c);
        }
        Expression cal(Expression that)
        {
            if (oper=='+') return plus(that,1);
            if (oper=='-') return plus(that,-1);
            return times(that);
        }
        List<String> toList()
        {
            List<String> ans=new ArrayList<>();
            for (Term t:list) 
            {
                String s=t.toString();
                if (s.length()>0) ans.add(s);
            }
            return ans;
        }
    }  
    List<Term> combine(List<Term> a) //combine the similar terms
    {
        Collections.sort(a,(t1,t2)->(t1.compareTo(t2))); //sort all terms to make similar terms together
        List<Term> c=new ArrayList<>();
        for (Term t:a)
        {
            if (c.size()!=0 && t.equals(c.get(c.size()-1))) c.get(c.size()-1).para+=t.para;
            else c.add(new Term(t));
        }
        return c;
    }
    public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
        for (int i=0;i<evalvars.length;i++) map.put(evalvars[i],evalints[i]);
        int i=0,l=expression.length();
        Stack<Expression> stack=new Stack<>();
        Stack<Integer> priStack=new Stack<>();
        Expression zero=new Expression(0);
        stack.push(zero);
        priStack.push(0);
        int pri=0;
        while (i<l)
        {
            char ch=expression.charAt(i);
            if (Character.isDigit(ch))
            {
                int num=0;
                while (i<l && Character.isDigit(expression.charAt(i)))
                {
                    num=num*10+(expression.charAt(i)-48);
                    i++;
                }
                stack.add(new Expression(num));
                continue;
            }
            if (Character.isLetter(ch))
            {
                String s="";
                while (i<l && Character.isLetter(expression.charAt(i)))
                {
                    s+=expression.charAt(i);
                    i++;
                }
                stack.add(new Expression(s));
                continue;
            }
            if (ch=='(') pri+=2;
            if (ch==')') pri-=2;
            if (ch=='+' || ch=='-' || ch=='*')
            {
                int nowPri=pri;
                if (ch=='*') nowPri++;
                while (!priStack.isEmpty() && nowPri<=priStack.peek())
                {
                    Expression now=stack.pop(),last=stack.pop();
                    priStack.pop();
                    stack.push(last.cal(now));
                }
                stack.peek().oper=ch;
                priStack.push(nowPri);
            }
            i++;
        }
        while (stack.size()>1)
        {
            Expression now=stack.pop(),last=stack.pop();
            stack.push(last.cal(now));
        }
        return stack.peek().toList();
    }
}
