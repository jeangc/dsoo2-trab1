package app.view.form;

import app.model.EntryModel;
import app.view.Renderable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewEntryFormView implements Renderable {
    private JPanel panel;
    private JTextField placa;
    private JButton saveButton;

    public EntryModel getEntry() {
        EntryModel model = new EntryModel();
        model.setPlaca(placa.getText());

        return model;
    }

    public Container getContainer() {
        return this.panel;
    }

    public void addSaveButtonClickListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }
}
