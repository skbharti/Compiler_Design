






























.text

main:

addi $sp, $sp, 4
li $s6, 108
addi $t0,$s6,0
addi $t1,$t0,0
lw $t2 0($sp)
addi $t3,$t2,36
lw $t4 16($sp)
lw $t4, 0($t3)
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $t4
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
addi $sp, $sp, -4
li $v0, 10 
syscall
addi $sp, $sp, 4
addi $sp, $sp, 12
foo_scope3:
li $s6, 10
addi $t5,$s6,0
addi $t6,$t5,0
addi $t7,$t2,-28
lw $t8 12($sp)
lw $t8, 0($t7)
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $t8
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
li $s6, 0
addi $t9,$s6,0
move $v0, $t9
jr $ra
addi $sp, $sp, -12
addi $sp, $sp, -4
