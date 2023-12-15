def turn_right():
    turn_left()
    turn_left()
    turn_left()
    
def height_r():
    while(not right_is_clear()):
         if(not at_goal()):
                move()
         else:
                return
    else:
        turn_right()
        if(not at_goal()):
                move()
        turn_right()
        while(front_is_clear()):
            if(not at_goal()):
                move()
            else:
                return
        turn_left()
        while(front_is_clear()):
            if(not at_goal()):
                move()
            else:
                return

        path_n()
def path_n():
    turn_left()
    if(not at_goal()):
        height_r()
    if(not at_goal()):
        move()
    else:
        return
    if(not at_goal()):
        height_r()
    if(not at_goal()):
        move()
    else:
        return
    if(not at_goal()):
        height_r()
    turn_left()
def forw():
    while(front_is_clear()):
        move()
    else:
        path_n()
        if(not at_goal()):
            forw()
forw()