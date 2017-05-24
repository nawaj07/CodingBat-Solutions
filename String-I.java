#Codingbat.com

#Module: String 1
==========================================================================================================================================
#helloName:

public String helloName(String name) {
  return "Hello " +name + "!";
}


#makeAbba :

public String makeAbba(String a, String b) {
  return a+b+b +a;
}

#makeTags :

public String makeTags(String tag, String word) {
  return "<" +tag + ">" + word + "<" + "/" + tag + ">";
}

#makeOutWord  :

public String makeOutWord(String out, String word) {
  if(out.length() <=4)
  {
    return out.substring(0,2) + word + out.substring(2,out.length());
  }
  return word;
}

#extraEnd :

public String extraEnd(String str) {
  if(str.length() > 2)
  {
    return str.substring(str.length()-2,str.length())+str.substring(str.length()-2,str.length()) +str.substring(str.length()-2,str.length());
  }
  return str + str + str;
}

#firstTwo :

public String firstTwo(String str) {
  if(str.length() > 2)
  {
    return str.substring(0,2);
  }
  return str;
}

#firstHalf :

public String firstHalf(String str) {
  return str.substring(0,str.length()/2);
}

#withoutEnd:

public String withoutEnd(String str) {
  return str.substring(1,str.length()-1);
}

#comboString :

public String comboString(String a, String b) {
  if(a.length()> b.length())
  {
    return b + a + b;

}
 return a + b + a;
}


#nonStart :

public String nonStart(String a, String b) {
  return a.substring(1,a.length()) + b.substring(1,b.length());

}


#left2 :

public String left2(String str) {
  if(str.length()>2)
  {
    return str.substring(2,str.length()) + str.substring(0,2);
  }
  return str;
}

#right2 :

public String right2(String str) {
  if(str.length()>2)
  {
    return str.substring(str.length()-2,str.length()) + str.substring(0,str.length()-2);
  }
  return str;
}


#theEnd :

public String theEnd(String str, boolean front) {
  if(front == true)
 { return str.substring(0,1);
}
return str.substring(str.length()-1,str.length());
}

#withouEnd2 :

public String withouEnd2(String str) {
  if(str.length()>2)
  {
    return str.substring(1,str.length()-1);
  }
  return "";
}


#middleTwo :

public String middleTwo(String str) {
  return str.substring((str.length()/2)-1,(str.length()/2)+1);
}

#endsLy :

public boolean endsLy(String str) {
if(str.length()<2)
return false;
 return (str.substring(str.length() - 2).equals("ly"));
}


#nTwice :

public String nTwice(String str, int n) {
  return str.substring(0,n) + str.substring(str.length()-n);
}

#twoChar :

public String twoChar(String str, int index) {
if(index < 0 || index+2 > str.length())
{ return str.substring(0,2);}
return str.substring(index,index+2);
}

#middleThree :

public String middleThree(String str) {
  if(str.length()>3)
  {
    return str.substring(str.length()/2-1,str.length()/2+2);
  }
  return str;
}


#hasBad :

public boolean hasBad(String str) {
 int len = str.length();
 if(len<=2)
 return false;
 if(len==3)
 return str.substring(0,3).equals("bad");

 return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
}

#atFirst :

public String atFirst(String str) {
  int len = str.length();
  if(len == 2)
  {return str;}
  if(len==0)
  {
    return "@@";
  }
  if(len<2)
  {
    return str + '@';
  }
  return str.substring(0,2);
}

#lastChars :

public String lastChars(String a, String b) {
  if(a.length()>0 && b.length()==0) return a.substring(0,1)+"@";
  if(a.length()==0 && b.length()>0)return "@"+b.substring(b.length()-1,b.length());
  if(a.length()>0 && b.length()>0)
    return a.substring(0,1) + b.substring(b.length()-1,b.length());
  return "@@";
}

#conCat :

public String conCat(String a, String b) {
 if(a.length()!=0 && b.length()!=0 && a.charAt(a.length()-1) == b.charAt(0))
 return a+b.substring(1);
 return a+b;
}

#lastTwo :

public String lastTwo(String str) {
if(str.length()<2) return str;
return str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);


}

#seeColor :

public String seeColor(String str) {
  if(str.length()>=3 && str.substring(0,3).equals("red")) return "red";
  if(str.length()>=4 && str.substring(0,4).equals("blue")) return "blue";
  return "";
}


#frontAgain  :

public boolean frontAgain(String str) {
 int len = str.length();
 if(len < 2) return false;
 return str.substring(0,2).equals(str.substring(len-2));
}

#minCat :

public String minCat(String a, String b) {
  if(a.length() == b.length()) return a + b;
  if(a.length() > b.length()) return a.substring(a.length()-b.length(),a.length()) + b;
  if(b.length() > a.length()) return a + b.substring(b.length()-a.length(),b.length());
  return a + b;


}

#extraFront  :

public String extraFront(String str) {
  if(str.length()>2) return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
  return str + str + str;

}


#without2 :

public String without2(String str) {
    if(str.length()==2 || str.length()==0) return "";
    if(str.length()==1) return str;
  if(str.length()>=2 & str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  return str.substring(2,str.length());
  return str;
}


#deFront :

public String deFront(String str) {
  if(str.charAt(0)=='a' && str.charAt(1)=='b') return str;
  if(str.charAt(0)=='a') return str.charAt(0)+str.substring(2,str.length());
  if(str.charAt(1)=='b') return str.charAt(1)+str.substring(2,str.length());

  return str.substring(2,str.length());
}

#startWord :

public String startWord(String str, String word) {
 if(word.length() > str.length()) return "";
 if(str.substring(0,word.length()).equals(word)) return word;
 if(str.substring(1,word.length()).equals(word.substring(1,word.length())))
 return str.charAt(0) + word.substring(1);
 return "";
}

#withoutX :

public String withoutX(String str) {
  if(str.length()==0) return "";
  if(str.charAt(0)=='x') str=str.substring(1);
  if(str.length()>0 && str.charAt(str.length()-1)=='x')
  str=str.substring(0,str.length()-1);
  return str;
}

#withoutX2  :

public String withoutX2(String str) {
  if(str.length()<2) return "";
  String result = "";
  if(str.charAt(0)!='x') result += str.charAt(0);
  if(str.charAt(1)!='x') result += str.charAt(1);
  result += str.substring(2);
  return result;
}
