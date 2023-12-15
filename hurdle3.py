def turn_right():
    turn_left()
    turn_left()
    turn_left()
def path_n():
    turn_left()
    if(not at_goal()):
        move()
    turn_right()
    if(not at_goal()):
        move()
    turn_right()
    if(not at_goal()):
        move()
    turn_left()
def forw():
    while(front_is_clear()):
        move()
    else:
        path_n()
        if(not at_goal()):
            forw()
forw()