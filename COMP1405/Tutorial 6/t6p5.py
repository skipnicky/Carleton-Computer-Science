def checkwinner(map):
    for i in range(0,3):
        if map[i][0] == map[i][1] == map[i][2] and map[i][0] != " ":
            winner = map[i][0]
        elif map[0][i] == map[1][i] == map[2][i] and map[0][i] != " ":
            winner = map[0][i]
        elif map[0][0] == map[1][1] == map[2][2] and map[0][0] != " ":
            winner = map[0][0]
        elif map[0][2] == map[1][1] == map[2][0] and map[0][2] != " ":
            winner = map[0][2]
        if " " not in map[0] and " " not in map[1] and " " not in map[2]:
            winner = "T"
    print(winner)

map = [["X","d","d"],
       ["X","d","d"],
       ["d","x","X"]]

checkwinner(map)
