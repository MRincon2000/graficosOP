/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficasop;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *
 * @author mrincono
 */
public class GraficasOP extends Application{
private TextField tnombre;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
       
           Pane panel = new Pane();
    Canvas tablero = new Canvas( 1024,512);
    panel.getChildren().add(tablero);
    GraphicsContext lapiz = tablero.getGraphicsContext2D();
        
        
        
        
        
        
        Label lnombre=new Label("Nombre");
        Label lapellido= new Label ("Apellido");
        this.tnombre= new TextField();
        TextField tapellido= new TextField();
        Button bt= new Button("Entrar");
        TableView table=new TableView();
        table.setEditable(true);
        TableColumn firstNameCol= new TableColumn("First Name");
        TableColumn lastNameCol= new TableColumn("Last Name");
        TableColumn emailCol= new TableColumn("Email");
        table.getColumns().addAll(firstNameCol,lastNameCol,emailCol);
        ToggleGroup group = new ToggleGroup();
        RadioButton rb1= new RadioButton("Masculino");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        RadioButton rb2= new RadioButton("Femenino");
        rb2.setToggleGroup(group);
        RadioButton rb3= new RadioButton("Otro");
        rb3.setToggleGroup(group);
        TextField totro=new TextField();
       Label lgenero= new Label("Genero");
        HBox layout1 =new HBox();
        HBox layout2= new HBox();
        VBox layout3= new VBox();
        VBox layoutP= new VBox();
        HBox layoutG= new HBox();
        HBox layoutO= new HBox();
        VBox radio= new VBox();
         radio.getChildren().add(rb1);
        radio.getChildren().add(rb2);
        layoutO.getChildren().add(rb3);
        layoutO.getChildren().add(totro);
        radio.getChildren().add(layoutO);
        layoutG.getChildren().add(lgenero);
        layoutG.getChildren().add(radio);
        layout1.getChildren().add(lnombre);
        layout1.getChildren().add(tnombre);
        layout2.getChildren().add(lapellido);
        layout2.getChildren().add(tapellido);
        layout3.getChildren().add(bt);
        layout3.getChildren().add(table);
        layoutP.getChildren().add(layout1);
        layoutP.getChildren().add(layout2);
        layoutP.getChildren().add(layoutG);
        layoutP.getChildren().add(layout3);
        layoutP.getChildren().add(panel);
     bt.setOnAction(new Evento());
     
        Scene scene= new Scene(layoutP,1024,512);
        stage.setTitle("Navegando en mi automovil y hablado con la nena por el movil....");
        stage.setScene(scene);
        stage.show();
     
    }
    
    private class Evento implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent t) {
           int  s=1;
      Animacion.getCarro().mover(s);
        }
    
   }
}
