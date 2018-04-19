














































.text

main:

addi $sp, $sp, 0
hello_scope3:
li $s6, 2
addi null,$s6,0
addi $t0,null,0
addi null,$t0,0
jr $ra
addi $sp, $sp, -20
sw $ra, 16($sp)
sw $a0, 12($sp)
sw $t0, 8($sp)
sw $t1, 4($sp)
sw $v0, 0($sp)
li $a0, 20000
sll $a0, $a0, 2
li $v0, 9
syscall
lw $t0, 8($sp)
lw $t1, 4($sp)
lw $a0, 12($sp)
move null, $v0
lw $v0, 0($sp)
lw $ra, 16($sp)
addi $sp, $sp, 20
addi $t1,null,0
li $s6, 3
addi null,$s6,0
addi $t0,null,0
sw $t1, -12($sp)
sw $t0, -8($sp)
label0_scope4:
lw $t0 -8($sp)
addi null,$t0,0
li $s6, 5
addi null,$s6,0
sub null, null, null
bltz null, _L0
add null, $zero, $zero
j _L1
_L0:
addi null, $zero, 1
_L1:
sw $t0, -8($sp)
bne null, $zero, label1_scope4
addi $sp, $sp, 8
lw $t0 -12($sp)
addi null,$t0,0
li $s6, 1
addi null,$s6,0
add null,null,null
addi $t0,null,0
sw $t0, -12($sp)
j null
label1_scope4:
addi $t0,null,0
li $v0, 10 
syscall
