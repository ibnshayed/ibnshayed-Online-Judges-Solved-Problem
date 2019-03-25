                           .MODEL SMALL
.STACK 100H
.DATA
N DW ?
M DW ?
i DW ?
j DW ?
X DW ?
Y DW ?
SUM DW ?
C DW ?
S1 DW "ENTER YOUR NUMBER : $"
S2 DW "THE NUMBER YOU ENTERED : $"        

.CODE 
MAIN     PROC
MOV AX,@DATA
MOV DS,AX   
INPUT:
MOV N,0
MOV i,1
MOV SUM,0
MOV M,10
LEA DX,S1
MOV AH,9
INT 21H
MOV AH,1
WHILE:
    INT 21H
    CMP AL,0DH
    JE INVALID
    SUB AL,48
    MOV BL,AL 
    MOV AX,N
    IMUL M
    MOV DX,AX
    MOV AL,BL
    AND AX,000FH  
    ADD DX,AX
    MOV N,DX 
    MOV AH,1
    JMP WHILE 

INVALID:

    CMP N,0
    JGE END_IF
     
    JMP ENDJ
    
    
END_IF:
    MOV AH,2
    MOV DL,0DH
    INT 21H
    MOV DL,0AH
    INT 21H
    LEA DX,S2
    MOV AH,9
    INT 21H
    MOV C,0
    
    PRINT1:
        MOV AX,N
        CMP AX,10000
        JL PRINTDIGIT1
        SUB AX,10000
        MOV N,AX
        INC C
        JMP PRINT1
    
    PRINTDIGIT1:
        MOV AH,2
        MOV BX,C
        ADD BX,48
        MOV DL,BL
        INT 21H
    
    MOV C,0
    
    PRINT2:
        MOV AX,N
        CMP AX,1000
        JL PRINTDIGIT2
        SUB AX,1000
        MOV N,AX
        INC C
        JMP PRINT2
    
    PRINTDIGIT2:
        MOV AH,2
        MOV BX,C
        ADD BX,48
        MOV DL,BL
        INT 21H
    
    MOV C,0
    
    PRINT3:
        MOV AX,N
        CMP AX,100
        JL PRINTDIGIT3
        SUB AX,100
        MOV N,AX
        INC C
        JMP PRINT3
    
    PRINTDIGIT3:
        MOV AH,2
        MOV BX,C
        ADD BX,48
        MOV DL,BL
        INT 21H
    
    MOV C,0
    
    PRINT4:
        MOV AX,N
        CMP AX,10
        JL PRINTDIGIT4
        SUB AX,10
        MOV N,AX
        INC C
        JMP PRINT4
    
    PRINTDIGIT4:
        MOV AH,2
        MOV BX,C
        ADD BX,48
        MOV DL,BL
        INT 21H
    
    MOV C,0
    
    PRINT5:
        MOV AX,N
        CMP AX,0
        JE PRINTDIGIT5
        SUB AX,1
        MOV N,AX
        INC C
        JMP PRINT5
    
    PRINTDIGIT5:
        MOV AH,2
        MOV BX,C
        ADD BX,48
        MOV DL,BL
        INT 21H
    
    MOV AH,2
    MOV DL,0DH
    INT 21H
    MOV DL,0AH
    INT 21H
    JMP INPUT
        

  JMP INPUT
ENDJ:
    MAIN ENDP 
END MAIN