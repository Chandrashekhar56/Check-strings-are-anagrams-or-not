var str1="hello baba";
var str2="olehlaa bb";

if(str1.length === str2.length)
{
  if(str1.split('').sort().join()===str2.split('').sort().join()) 
  {
    console.log("this is annagram")
  }
  else
  {
    console.log("this is not anagram");
  }
}
else
{
  console.log("this is not anagram");
}
