class Solution {
public:
int firstUniqChar(string s) 
{
  map<char, pair<int, int>> storage;
  int i = 0;
  while(s[i] != '\0')
  {
    storage.insert(pair<char,pair<int,int>>(s[i],pair<int,int>(i,0)));
    i++;
  }
  i = 0;
  while(s[i] != '\0')
  {
    auto temp = storage.find(s[i++]);
    temp->second.second ++;
  }
  i = 0;
  while(s[i] != '\0')
  {
    auto temp = storage.find(s[i]);
    if (temp->second.second == 1)
      return i;
    i++;
  }
  return -1;
}
};