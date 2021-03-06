package sistema_de_vendas;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.WriteResult;
            
public final class TelaPrincipal extends javax.swing.JFrame {

    String modoCliente, modoProduto;    
    ConectionMongo conectionmongo = new ConectionMongo();
    
    public TelaPrincipal() {
        
        modoCliente = "Navegar";
        modoProduto = "Navegar";
        
        conectionmongo.startMongo();    
        
        initComponents();
        carregaTabelaCliente();
        carregaTabelaProduto();
        manipulaInterfaceProduto();
        manipulaInterfaceClientes();
        
    }
    
    public void carregaTabelaCliente(){
        
        DBCursor cursor = conectionmongo.returnTableClientes().find();
        
//        while(cursor.hasNext()){
            areaClientes.setText(areaClientes.getText() + "\n" + cursor.next());
//        }
        
    }

    public void carregaTabelaProduto(){
        
       DBCursor cursor = conectionmongo.returnTableProdutos().find();
        
        while(cursor.hasNext()){
            area_produtos.setText(area_produtos.getText() + "\n" + cursor.next());
        }
        
    }   
    
    public void manipulaInterfaceProduto(){
        switch(modoProduto){
            case "Navegar":{
                botao_pro_cadastrar.setEnabled(true);
                botao_pro_editar.setEnabled(true);
                botao_pro_excluir.setEnabled(true);
                botao_pro_salvar.setEnabled(false);
                botao_pro_cancelar.setEnabled(false);
                c_pro_codigo.setEnabled(false);
                c_pro_preco.setEnabled(false);
                c_pro_nome.setEnabled(false);   
                break;
            }
            case "Cadastrar":{
                botao_pro_cadastrar.setEnabled(true);
                botao_pro_editar.setEnabled(false);
                botao_pro_excluir.setEnabled(false);
                botao_pro_salvar.setEnabled(true);
                botao_pro_cancelar.setEnabled(true);
                c_pro_codigo.setEnabled(true);
                c_pro_preco.setEnabled(true);
                c_pro_nome.setEnabled(true);   
                break;
            }
            case "Editar":{
                botao_pro_cadastrar.setEnabled(false);
                botao_pro_editar.setEnabled(true);
                botao_pro_excluir.setEnabled(false);
                botao_pro_salvar.setEnabled(true);
                botao_pro_cancelar.setEnabled(true);
                c_pro_codigo.setEnabled(true);
                c_pro_preco.setEnabled(true);
                c_pro_nome.setEnabled(true);   
                break;
            }
            case "Excluir":{
                botao_pro_cadastrar.setEnabled(false);
                botao_pro_editar.setEnabled(false);
                botao_pro_excluir.setEnabled(true);
                botao_pro_salvar.setEnabled(true);
                botao_pro_cancelar.setEnabled(true);
                c_pro_codigo.setEnabled(true);
                c_pro_preco.setEnabled(false);
                c_pro_nome.setEnabled(false);   
                break;
            }
            case "Selecionado":{
                botao_pro_cadastrar.setEnabled(true);
                botao_pro_editar.setEnabled(true);
                botao_pro_excluir.setEnabled(true);
                botao_pro_salvar.setEnabled(true);
                botao_pro_cancelar.setEnabled(true);
                c_pro_codigo.setEnabled(true);
                c_pro_preco.setEnabled(true);
                c_pro_nome.setEnabled(true);   
                break;
            }
            default: System.out.println("Modo inválida.");
        }
    }

    public void manipulaInterfaceClientes(){
        switch(modoCliente){
            case "Navegar":{
                botao_cli_cadastrar.setEnabled(true);
                botao_cli_editar.setEnabled(true);
                botao_cli_excluir.setEnabled(true);
                botao_cli_salvar.setEnabled(false);
                botao_cli_cancelar.setEnabled(false);
                c_cli_id.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                c_cli_nome.setEnabled(false);   
                break;
            }
            case "Cadastrar":{
                botao_cli_cadastrar.setEnabled(true);
                botao_cli_editar.setEnabled(false);
                botao_cli_excluir.setEnabled(false);
                botao_cli_salvar.setEnabled(true);
                botao_cli_cancelar.setEnabled(true);
                c_cli_id.setEnabled(true);
                c_cli_cpf.setEnabled(true);
                c_cli_nome.setEnabled(true);   
                break;
            }
            case "Editar":{
                botao_cli_cadastrar.setEnabled(false);
                botao_cli_editar.setEnabled(true);
                botao_cli_excluir.setEnabled(false);
                botao_cli_salvar.setEnabled(true);
                botao_cli_cancelar.setEnabled(true);
                c_cli_id.setEnabled(true);
                c_cli_cpf.setEnabled(true);
                c_cli_nome.setEnabled(true);   
                break;
            }
            case "Excluir":{
                botao_cli_cadastrar.setEnabled(false);
                botao_cli_editar.setEnabled(false);
                botao_cli_excluir.setEnabled(true);
                botao_cli_salvar.setEnabled(true);
                botao_cli_cancelar.setEnabled(true);
                c_cli_id.setEnabled(true);
                c_cli_cpf.setEnabled(false);
                c_cli_nome.setEnabled(false);   
                break;
            }
            case "Selecionado":{
                botao_cli_cadastrar.setEnabled(true);
                botao_cli_editar.setEnabled(true);
                botao_cli_excluir.setEnabled(true);
                botao_cli_salvar.setEnabled(false);
                botao_cli_cancelar.setEnabled(false);
                c_cli_id.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                c_cli_nome.setEnabled(false);   
                break;
            }
            default: System.out.println("Modo inválida.");
        }
    }
    
    public void limpaCampos(){
        c_cli_id.setText("");
        c_cli_cpf.setText("");
        c_cli_nome.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_cli_id = new javax.swing.JTextField();
        c_cli_cpf = new javax.swing.JTextField();
        botao_cli_salvar = new javax.swing.JButton();
        botao_cli_cancelar = new javax.swing.JButton();
        c_cli_nome = new javax.swing.JTextField();
        botao_cli_cadastrar = new javax.swing.JButton();
        botao_cli_editar = new javax.swing.JButton();
        botao_cli_excluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaClientes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        botao_pro_cadastrar = new javax.swing.JButton();
        botao_pro_editar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c_pro_codigo = new javax.swing.JTextField();
        c_pro_preco = new javax.swing.JTextField();
        botao_pro_salvar = new javax.swing.JButton();
        botao_pro_cancelar = new javax.swing.JButton();
        c_pro_nome = new javax.swing.JTextField();
        botao_pro_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_produtos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 16))); // NOI18N

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        botao_cli_salvar.setText("Salvar");
        botao_cli_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cli_salvarActionPerformed(evt);
            }
        });

        botao_cli_cancelar.setText("Cancelar");
        botao_cli_cancelar.setMaximumSize(new java.awt.Dimension(100, 29));
        botao_cli_cancelar.setMinimumSize(new java.awt.Dimension(100, 29));
        botao_cli_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cli_cancelarActionPerformed(evt);
            }
        });

        c_cli_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cli_nomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_cli_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_cli_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(c_cli_id, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_cli_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cli_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(c_cli_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_cli_salvar)
                    .addComponent(botao_cli_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botao_cli_cadastrar.setText("Cadastrar");
        botao_cli_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cli_cadastrarActionPerformed(evt);
            }
        });

        botao_cli_editar.setText("Editar");
        botao_cli_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cli_editarActionPerformed(evt);
            }
        });

        botao_cli_excluir.setText("Excluir");
        botao_cli_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cli_excluirActionPerformed(evt);
            }
        });

        areaClientes.setColumns(20);
        areaClientes.setRows(5);
        jScrollPane3.setViewportView(areaClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botao_cli_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_cli_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_cli_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_cli_cadastrar)
                    .addComponent(botao_cli_editar)
                    .addComponent(botao_cli_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        botao_pro_cadastrar.setText("Cadastrar");
        botao_pro_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pro_cadastrarActionPerformed(evt);
            }
        });

        botao_pro_editar.setText("Editar");
        botao_pro_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pro_editarActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray), "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 16))); // NOI18N

        jLabel4.setText("Código:");

        jLabel5.setText("Nome:");

        jLabel6.setText("Preço:");

        botao_pro_salvar.setText("Salvar");
        botao_pro_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pro_salvarActionPerformed(evt);
            }
        });

        botao_pro_cancelar.setText("Cancelar");
        botao_pro_cancelar.setMaximumSize(new java.awt.Dimension(100, 29));
        botao_pro_cancelar.setMinimumSize(new java.awt.Dimension(100, 29));
        botao_pro_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pro_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_pro_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_pro_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(c_pro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_pro_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_pro_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_pro_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_pro_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_pro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_pro_salvar)
                    .addComponent(botao_pro_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botao_pro_excluir.setText("Excluir");
        botao_pro_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pro_excluirActionPerformed(evt);
            }
        });

        area_produtos.setColumns(20);
        area_produtos.setRows(5);
        jScrollPane1.setViewportView(area_produtos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botao_pro_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_pro_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_pro_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_pro_cadastrar)
                    .addComponent(botao_pro_editar)
                    .addComponent(botao_pro_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Produtos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Venda", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_pro_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pro_excluirActionPerformed

        modoProduto = "Excluir";
        manipulaInterfaceProduto();
        
    }//GEN-LAST:event_botao_pro_excluirActionPerformed

    private void botao_pro_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pro_cancelarActionPerformed
        modoProduto = "Navegar";
        manipulaInterfaceProduto();

        limpaCampos();
    }//GEN-LAST:event_botao_pro_cancelarActionPerformed

    private void botao_pro_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pro_salvarActionPerformed

        if(modoProduto == "Cadastrar"){
            BasicDBObject document = new BasicDBObject();
            document.put("codigo: ", "'" + c_pro_codigo.getText() +"'");
            document.put("preco: ", c_pro_preco.getText());
            document.put("nome: ", "'" + c_pro_nome.getText() + "'");
            conectionmongo.returnTableProdutos().insert(document);

            carregaTabelaProduto();
            modoProduto = "Navegar";
            manipulaInterfaceProduto();

            limpaCampos();
        } else if(modoProduto == "Editar"){
        
           
            BasicDBObject whereQuery = new BasicDBObject();
            BasicDBObject whereQuery2 = new BasicDBObject();

            whereQuery.put("codigo: ", "'" + c_pro_codigo.getText() +"'");
            whereQuery2.put("codigo: ", "'" + c_pro_codigo.getText() +"'");
            whereQuery2.put("preco: ", c_pro_preco.getText());
            whereQuery2.put("nome: ", "'" + c_pro_nome.getText() + "'");
            conectionmongo.returnTableProdutos().update(whereQuery, whereQuery2);
        
//        conectionmongo.returnTableClientes().update(whereQuery, whereQuery);
        
        carregaTabelaProduto();
            modoProduto = "Navegar";
            manipulaInterfaceProduto();
        
        
        } else if(modoProduto == "Excluir"){
            
            manipulaInterfaceProduto();
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("codigo: ", "'" + c_pro_codigo.getText()+"'");
            DBCursor cursor = conectionmongo.returnTableProdutos().find(whereQuery);

            conectionmongo.returnTableProdutos().remove(whereQuery);

            carregaTabelaProduto();
            limpaCampos();
            
        }
    }//GEN-LAST:event_botao_pro_salvarActionPerformed

    private void botao_pro_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pro_editarActionPerformed
        modoProduto = "Editar";
        manipulaInterfaceProduto();
    }//GEN-LAST:event_botao_pro_editarActionPerformed

    private void botao_pro_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pro_cadastrarActionPerformed
        modoProduto = "Cadastrar";

        limpaCampos();
        manipulaInterfaceProduto();
    }//GEN-LAST:event_botao_pro_cadastrarActionPerformed

    private void botao_cli_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cli_excluirActionPerformed
        
        modoCliente = "Excluir";
        manipulaInterfaceClientes();
        
    }//GEN-LAST:event_botao_cli_excluirActionPerformed

    private void botao_cli_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cli_editarActionPerformed
        
        modoCliente = "Editar";
        manipulaInterfaceClientes();
        limpaCampos();

    }//GEN-LAST:event_botao_cli_editarActionPerformed

    private void botao_cli_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cli_cadastrarActionPerformed
        
        modoCliente = "Cadastrar";
        manipulaInterfaceClientes();
        limpaCampos();
        
    }//GEN-LAST:event_botao_cli_cadastrarActionPerformed

    private void botao_cli_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cli_cancelarActionPerformed
        modoCliente = "Navegar";
        manipulaInterfaceClientes();
        limpaCampos();
    }//GEN-LAST:event_botao_cli_cancelarActionPerformed

    private void botao_cli_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cli_salvarActionPerformed

        if(modoCliente == "Cadastrar"){
            BasicDBObject document = new BasicDBObject();
            document.put("id: ", "'" + c_cli_id.getText() +"'");
            document.put("cpf: ", c_cli_cpf.getText());
            document.put("nome: ", "'" + c_cli_nome.getText() + "'");
            conectionmongo.returnTableClientes().insert(document);

            carregaTabelaCliente();
            modoCliente = "Navegar";
            manipulaInterfaceClientes();

            limpaCampos();
        } else if(modoCliente == "Excluir"){
            
            manipulaInterfaceClientes();
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("id: ", "'" + c_cli_id.getText()+"'");
            DBCursor cursor = conectionmongo.returnTableClientes().find(whereQuery);

            conectionmongo.returnTableClientes().remove(whereQuery);

            carregaTabelaCliente();
            limpaCampos();
            
        } 
//        else if(modoCliente == "Editar"){
//            BasicDBObject whereQuery = new BasicDBObject();
//            BasicDBObject whereQuery2 = new BasicDBObject();
//
//            whereQuery.put("id:", "'" + c_cli_id.getText()+"'");
//            whereQuery2.put("nome:", "'" + c_cli_nome.getText()+"'");
//            conectionmongo.returnTableClientes().update(whereQuery, whereQuery2);
//        
////        conectionmongo.returnTableClientes().update(whereQuery, whereQuery);
//        
//        carregaTabelaCliente();
//        }
        
    }//GEN-LAST:event_botao_cli_salvarActionPerformed

    private void c_cli_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cli_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cli_nomeActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaClientes;
    private javax.swing.JTextArea area_produtos;
    private javax.swing.JButton botao_cli_cadastrar;
    private javax.swing.JButton botao_cli_cancelar;
    private javax.swing.JButton botao_cli_editar;
    private javax.swing.JButton botao_cli_excluir;
    private javax.swing.JButton botao_cli_salvar;
    private javax.swing.JButton botao_pro_cadastrar;
    private javax.swing.JButton botao_pro_cancelar;
    private javax.swing.JButton botao_pro_editar;
    private javax.swing.JButton botao_pro_excluir;
    private javax.swing.JButton botao_pro_salvar;
    private javax.swing.JTextField c_cli_cpf;
    private javax.swing.JTextField c_cli_id;
    private javax.swing.JTextField c_cli_nome;
    private javax.swing.JTextField c_pro_codigo;
    private javax.swing.JTextField c_pro_nome;
    private javax.swing.JTextField c_pro_preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
