a=[]
b=[]
c=[]
print("Enter elements of 3X3 matrix1: ")
for i in range(3):
    x = [i for i in input().split(' ')]
    a.append(x)
print("\nEnter elements of 3X3 matrix2: ")
for i in range(3):
    x = [i for i in input().split(' ')]
    b.append(x)
for i in range(3):
    x=[]
    for j in range(3):
        t=""
        for k in range(3):
            if b[k][j]=='1':
                t+= a[i][k]+" + "
            elif b[k][j]=='0':
                t+= ""
            else:
                t+= a[i][k]+b[k][j] + " + "
        t=t[:-2]
        x.append(t)
    c.append(x)
print()
for i in c:
    for j in i:
        print(j, end="   ")
    print()
