class Solution {
public:
vector<vector<int>> generate(int numRows) {
    if(numRows == 1)
    {
      return {{1}};
    }
    else if (numRows == 2)
    {
      return {{1}, {1,1}};
    }
    else 
    {
      vector<vector<int>> result = {{1}, {1,1}};
      for(int i = 3; i <= numRows; i ++)
      {
        vector<int> temp = {1};
        for(int first = 0, second = 1; second < result[i-2].size();first++, second++)
        {
          temp.push_back(result[i-2][first] + result[i-2][second]);
        }
        temp.push_back(1);
        result.push_back(temp);
      }
      return result;
    }
}
};