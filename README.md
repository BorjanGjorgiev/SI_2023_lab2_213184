# SI_2023_lab2_INDEX

Borjan Gjorgiev
213184

2.Control Flow Graph
![image](https://github.com/BorjanGjorgiev/SI_2023_lab2_INDEX/assets/127698412/059e8d11-c28f-4ff3-8e6c-1a5eb9f85be5)


3.Цикломатската комплексност на дадениот код за оваа лабараториска вежба изнесува 11.До ова решение можеме да дојдеме на два начини.
I-броење на регионите на цртежот. Бројот на региони(10) + 1 = 11
II-Преку формула. Бројот на ребра(37) - бројот на јазли(28) + 2 = 11

4. Oбјаснување за Еvery Branch критериумот

Искористив 5 тест случаи 
I- User=null,allUsers=[]
Во овој тест случај се поминува 1-2 branch а потоа се фрла исклучок и со тоа завршува програмата.
II- User=user1 ; allUsers[user1,user2,user3]
email:user1@gmail.com
user1=emal,username,password=lozinka56?

Во овој случај имаме внесено user со соодветни email,username,password и листа од 3 users

Нашиот email има @ и " . " 

Нашата лозинка има повеќе од 8 карактери и еден специјален знак.

III-
argumenti: user1, user1,user2,user3
user1 username: null
pass: lozinka56
email: user1gmail.com (ne sodrzi @)
Во овој случај немаме username нашиот email не содржи @ и лозинката нема специјален знак.

IV-
argumenti: user1, user1,user2,user3
user1 username: null
pass: lozinka 56
email: user1gmail.com (ne sodrzi @)

Истите аргументи од претходниот тест случај.Единствената разлика е во тоа што има празно место кај лозинката.

V-
argumenti: user1, user1,user2,user3
user1 username: null
pass: user1
email: user1gmail.com (ne sodrzi @)
 
Пасвордот:user1 Ист е како username
email:user1gmail.com Нема @

5.Multiple Condition statement
if (user==null || user.getPassword()==null || user.getEmail()==null).

T X X       user=null

F T X       user!=null,password=null,email=X

F F T       user!=null,password!=null,email=null

F F F       user!=null,password!=null,email=!null

