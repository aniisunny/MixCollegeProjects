b,l,d = map(int, input().split())

listb = list(map(int, input().split()))

ll = []

for _ in range(l):
    temp = []
    templ = list(map(int,input().split()))
    temp.append(templ)
    templ = list(map(int,input().split()))
    temp.append(templ)
    ll.append(temp)

min_days = d+1

scanned_books = []
cur = l
days = d

don = []

for i in range(l):
    if( ll[i][0][1] < min_days and not i in don):
        cur = i
        min_days = ll[i][0][1]

don.append(cur)

no = 0
ret = []
while(days >= 0):
    ans = []
    lib = []
    lib.append(cur)
    days -= ll[cur][0][1]
    min_days = d

    for i in range(l):
        if( ll[i][0][1] < min_days and not i in don):
            cur = i
            min_days = ll[i][0][1]
    num_book = 0
    bk_sc = []
    # bk_id = ll[lib[0]][1][0]
    for i in range(min_days):
        for k in range(ll[lib[0]][0][2]):

            for z in ll[lib[0]][1]:
                if(not z in scanned_books):
                    bk_sc.append(str(z))
                    scanned_books.append(z)
                    num_book += 1
                    break

            # z = k
            # while True:
            #     bk_id = ll[lib[0]][1][z]
            #     if(not bk_id in scanned_books):
            #         bk_sc.append(str(bk_id))
            #         num_book += 1
            #         break
            #     z += 1

    l -= 1
    don.append(cur)
    if(num_book == 0):
        continue

    lib.append(num_book)

    ans.append(lib)
    ans.append(bk_sc)
    ret.append(ans)
    no += 1
    # print(lib[0],lib[1],sep=' ')
    # print(' '.join(bk_sc))

print(no)

# print(ret)

for i in ret:
    print(i[0][0],i[0][1],sep=' ')
    print(' '.join(i[1]))