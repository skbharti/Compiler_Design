





















.text

main:

addi $sp, $sp, 0
li $s6, 3
addi $t0,$s6,0
addi $t1,$t0,0
addi $sp, $sp, 16
sw $t0, -20($sp)
sw $t1, -24($sp)
label0_scope2:
lw $t0 -24($sp)
addi $t1,$t0,0
li $s6, 5
addi $t2,$s6,0
sub $t3, $t1, $t2
bltz $t3, _L0
add $t3, $zero, $zero
j _L1
_L0:
addi $t3, $zero, 1
_L1:
sw $t1, -8($sp)
sw $t2, -4($sp)
sw $t3, -16($sp)
sw $t0, -24($sp)
bne $t3, $zero, label1_scope2
addi $sp, $sp, 8
lw $t0 -36($sp)
addi $t1,$t0,0
li $s6, 1
addi $t2,$s6,0
add $t3,$t1,$t2
addi $t0,$t3,0
addi $sp, $sp, -12
sw $t1, -8($sp)
sw $t2, -4($sp)
sw $t3, -12($sp)
sw $t0, -36($sp)
j label0_scope2
label1_scope2:
addi $sp, $sp, -8
lw $t0 -24($sp)
addi $t1,$t0,0
addi $sp, $sp, -12
sw $a0, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $v0, 1
move $a0, $t1
syscall
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $a0, 8($sp)
addi $sp, $sp, 12
addi $sp, $sp, -16
li $v0, 10 
syscall
