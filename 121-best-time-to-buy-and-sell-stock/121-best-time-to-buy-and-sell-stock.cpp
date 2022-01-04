class Solution {
public:
    int maxProfit(vector<int>& prices) {
  int minPrice = INT32_MAX;
  int maxProfit = 0;
  for(auto i = prices.begin(); i != prices.end(); i++)
  {
    if(*i < minPrice)
      minPrice = *i;
    else
    {
      if(maxProfit < (*i - minPrice))
        maxProfit = *i - minPrice;
    }
  } 
  return maxProfit;
    }
};