n = int(input())

if n%4==0:
    if n%100==0:
        if n%400==0:
            print("Leap")
        else:
            print("Not leap")
    else:
        print("Leap")
else:
    print("Not leap")