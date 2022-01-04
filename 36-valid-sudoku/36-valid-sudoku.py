def checkRow(board, row):
  myFlags = [True]*9
  for i in range(9):
    if board[row][i] != '.':
      if myFlags[int(board[row][i]) - 1] == False:
        print("It is here1")
        return False
      else: myFlags[int(board[row][i]) - 1] = False
  return True
def checkColumn(board, col):
  myFlags = [True]*9
  for i in range(9):
    if board[i][col] != '.':
      if myFlags[int(board[i][col]) - 1] == False:
        return False
      else: myFlags[int(board[i][col]) - 1] = False
  return True
def checkSubSquare(board, row, col):
  myFlags = [True]*9
  for i in range (row*3, 3*row + 3):
    for j in range (col*3, 3*col +3):
      if board[i][j] != '.':
        if myFlags[int(board[i][j]) - 1] == False:
          print(row, col)
          return False
        else: myFlags[int(board[i][j]) - 1] = False
  return True
class Solution(object):
    def isValidSudoku(self,board):
      for i in range(9):
        if not checkColumn(board, i):
          return False
        if not checkRow(board, i):
          return False
      for i in range(3):
        for j in range(3):
          if not checkSubSquare (board, i, j):
            return False
      return True
        
        