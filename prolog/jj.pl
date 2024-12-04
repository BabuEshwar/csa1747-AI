goal_state(goal).
heuristic(a, 5).
heuristic(b, 3).
heuristic(c, 2).
heuristic(goal, 0).
edge(a, b, 1).
edge(a, c, 2).
edge(b, goal, 4).
edge(c, goal, 1).
bfs(Start, Path, Cost) :- heuristic(Start, HCost), bfs_helper([node(Start, [], 0, HCost)], Path, Cost).
