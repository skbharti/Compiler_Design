

















.text

main:

addi $sp, $sp, 0
addi $sp, $sp, 20
sw $ra, -16($sp)
sw $a0, -12($sp)
sw $t0, -8($sp)
sw $t1, -4($sp)
sw $v0, 0($sp)
li $a0, 3
sll $a0, $a0, 2
li $v0, 9
syscall
lw $t0, -8($sp)
lw $t1, -4($sp)
lw $a0, -12($sp)
move $t0, $v0
lw $v0, 0($sp)
lw $ra, -16($sp)
addi $sp, $sp, -20
addi $t1,$t0,0
li $s6, 10
addi $t2,$s6,0
li $s6, 0
addi $t3,$s6,0
li $s6, 0
addi $t4,$s6,0
li $s7, 3
mult $s7,$t4
mflo $t5
add $t3,$t3,$t5
li $s6, 3
li $s7, 1
sub $t6, $s6, $s7
mult $t6,$t4
mflo $t6
sub $t3,$t3,$t6
sll $t3,$t3, 2
addi $t3, $t3, 4
add $t3,$sp,$t3
sw $t2, 0($t3)
li $s6, 0
addi $t7,$s6,0
li $s6, 0
addi $t8,$s6,0
li $s7, 3
mult $s7,$t8
mflo $t9
add $t7,$t7,$t9
li $s6, 3
li $s7, 1
sub $s0, $s6, $s7
mult $s0,$t8
mflo $s0
sub $t7,$t7,$s0
sll $t7,$t7, 2
addi $t7, $t7, 4
add $t7,$sp,$t7
lw $s1, 0($t7)
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $s1
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
addi $sp, $sp, 0
li $v0, 10 
syscall
